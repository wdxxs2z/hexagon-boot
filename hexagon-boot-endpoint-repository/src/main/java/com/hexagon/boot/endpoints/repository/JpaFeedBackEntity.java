package com.hexagon.boot.endpoints.repository;

import com.hexagon.boot.domain.model.FeedBackEntity;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class JpaFeedBackEntity extends FeedBackEntity {
    public JpaFeedBackEntity(){}
    public JpaFeedBackEntity(FeedBackEntity var1) {
        super(var1);
    }

    @Override
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getId() {
        return super.getId();
    }

    @Override
    public Long getErrorRequestTime() {
        return super.getErrorRequestTime();
    }

    @Override
    public String getReferer() {
        return super.getReferer();
    }

    @Override
    public String getAppType() {
        return super.getAppType();
    }

    @Override
    public String getUserAgent() {
        return super.getUserAgent();
    }

    @Override
    public String getPageUrl() {
        return super.getPageUrl();
    }

    @Override
    public String getErrorType() {
        return super.getErrorType();
    }

    @Override
    public String getErrorDesc() {
        return super.getErrorDesc();
    }

    @Override
    public String getErrorApi() {
        return super.getErrorApi();
    }

    @Override
    public String getErrorRequest() {
        return super.getErrorRequest();
    }

    @Override
    public String getErrorResponse() {
        return super.getErrorResponse();
    }
}