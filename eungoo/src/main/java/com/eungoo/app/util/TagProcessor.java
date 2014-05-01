package com.eungoo.app.util;

import java.util.Set;

import com.eungoo.app.domain.Tag;
import com.eungoo.app.repository.TagRepository;
import com.google.common.collect.Sets;

public class TagProcessor {
	private TagRepository tagRepository;

	public TagProcessor(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}

	public String[] parsePlainTags(String plainTags) {
		if (plainTags == null) {
			return new String[] {};
		}
		return plainTags.split(" ");
	}

	public Set<Tag> processTags(String plainTags) {
		Set<Tag> tags = Sets.newHashSet();

		for (String each : parsePlainTags(plainTags)) {
			Tag tag = tagRepository.findByNames(each);
			if (tag == null) {
				tag = tagRepository.save(Tag.newTag(each));
			}
			tags.add(tag);
		}
		return tags;
	}
}
