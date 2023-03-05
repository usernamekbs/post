package com.soccer.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1743717971L;

    public static final QMember member = new QMember("member1");

    public final StringPath member_email = createString("member_email");

    public final StringPath member_nick = createString("member_nick");

    public final NumberPath<Long> member_no = createNumber("member_no", Long.class);

    public final StringPath member_password = createString("member_password");

    public final EnumPath<com.soccer.model.common.Role> member_role = createEnum("member_role", com.soccer.model.common.Role.class);

    public final StringPath memberid = createString("memberid");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

