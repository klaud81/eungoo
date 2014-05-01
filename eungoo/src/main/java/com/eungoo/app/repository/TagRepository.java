package com.eungoo.app.repository;

import com.eungoo.app.domain.Tag;

public interface TagRepository {
	Tag findByNames(String name);

	Tag save(Tag tag);
}
