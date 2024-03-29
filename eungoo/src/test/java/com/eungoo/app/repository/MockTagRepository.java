package com.eungoo.app.repository;

import java.util.Map;

import com.eungoo.app.domain.Tag;
import com.google.common.collect.Maps;

public class MockTagRepository implements TagRepository {
	static Map<String, Tag> pooledTags = Maps.newHashMap();
	static {
		pooledTags.put("java", Tag.pooledTag("java"));
		pooledTags.put("eclipse", Tag.pooledTag("eclipse"));
	}

	@Override
	public Tag findByNames(String name) {
		return pooledTags.get(name);
	}

	@Override
	public Tag save(Tag tag) {
		pooledTags.put(tag.getName(), tag);
		return tag;
	}

}
