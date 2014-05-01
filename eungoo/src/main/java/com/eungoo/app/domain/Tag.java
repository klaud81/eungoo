package com.eungoo.app.domain;

public class Tag {
	private String name;

	private boolean pooled;

	private int taggedCount = 0;

	private Tag(String name, boolean pooled) {
		this.setName(name);
		this.setPooled(pooled);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPooled() {
		return pooled;
	}

	public void setPooled(boolean pooled) {
		this.pooled = pooled;
	}

	public void tagged() {
		this.taggedCount += 1;
	}

	public void deTagged() {
		this.taggedCount -= 1;
	}

	public int getTaggedCount() {
		return taggedCount;
	}

	public void setTaggedCount(int taggedCount) {
		this.taggedCount = taggedCount;
	}

	public static Tag pooledTag(String name) {
		return new Tag(name, true);
	}

	public static Tag newTag(String name) {
		return new Tag(name, false);
	}

	@Override
	public String toString() {
		return "Tag [name=" + name + ", taggedCount=" + taggedCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (pooled ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Tag other = (Tag)obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		if (pooled != other.pooled)
			return false;

		return true;
	}
}
