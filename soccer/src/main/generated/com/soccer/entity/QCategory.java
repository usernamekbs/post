package com.soccer.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCategory is a Querydsl query type for Category
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategory extends EntityPathBase<Category> {

    private static final long serialVersionUID = 24228689L;

    public static final QCategory category = new QCategory("category");

    public final NumberPath<Integer> category_no = createNumber("category_no", Integer.class);

    public final NumberPath<Integer> category_parent = createNumber("category_parent", Integer.class);

    public final StringPath category_title = createString("category_title");

    public final StringPath categroy_url = createString("categroy_url");

    public final NumberPath<Integer> pno = createNumber("pno", Integer.class);

    public QCategory(String variable) {
        super(Category.class, forVariable(variable));
    }

    public QCategory(Path<? extends Category> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategory(PathMetadata metadata) {
        super(Category.class, metadata);
    }

}

