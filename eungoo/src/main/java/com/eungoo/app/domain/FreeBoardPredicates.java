package com.eungoo.app.domain;

import com.mysema.query.types.expr.BooleanExpression;

public class FreeBoardPredicates {
	public static BooleanExpression titleLike(final String searchTerm) {
		return QFreeBoard.freeBoard.title.contains(searchTerm);
	}
}
