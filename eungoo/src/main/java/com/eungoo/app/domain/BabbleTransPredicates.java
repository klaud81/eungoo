package com.eungoo.app.domain;

import com.mysema.query.types.expr.BooleanExpression;

public class BabbleTransPredicates {
	public static BooleanExpression textLike(final String searchTerm) {
		return QBabbleTrans.babbleTrans.text.contains(searchTerm);
	}
}
