package com.twitter.hashtag.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HashTagResults {

    private SearchMetadataEntity search_metadata;

    private List<StatusesEntity> statuses;

    public void setSearch_metadata(SearchMetadataEntity search_metadata) {
        this.search_metadata = search_metadata;
    }

    public void setStatuses(List<StatusesEntity> statuses) {
        this.statuses = statuses;
    }

    public SearchMetadataEntity getSearch_metadata() {
        return search_metadata;
    }

    public List<StatusesEntity> getStatuses() {
        return statuses;
    }

    public static class SearchMetadataEntity {
        private double completed_in;
        private long max_id;
        private String max_id_str;
        private String next_results;
        private String query;
        private String refresh_url;
        private int count;
        private int since_id;
        private String since_id_str;

        public void setCompleted_in(double completed_in) {
            this.completed_in = completed_in;
        }

        public void setMax_id(long max_id) {
            this.max_id = max_id;
        }

        public void setMax_id_str(String max_id_str) {
            this.max_id_str = max_id_str;
        }

        public void setNext_results(String next_results) {
            this.next_results = next_results;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public void setRefresh_url(String refresh_url) {
            this.refresh_url = refresh_url;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void setSince_id(int since_id) {
            this.since_id = since_id;
        }

        public void setSince_id_str(String since_id_str) {
            this.since_id_str = since_id_str;
        }

        public double getCompleted_in() {
            return completed_in;
        }

        public long getMax_id() {
            return max_id;
        }

        public String getMax_id_str() {
            return max_id_str;
        }

        public String getNext_results() {
            return next_results;
        }

        public String getQuery() {
            return query;
        }

        public String getRefresh_url() {
            return refresh_url;
        }

        public int getCount() {
            return count;
        }

        public int getSince_id() {
            return since_id;
        }

        public String getSince_id_str() {
            return since_id_str;
        }
    }

    public static class StatusesEntity {

        private MetadataEntity metadata;
        private String created_at;
        private long id;
        private String id_str;
        private String text;
        private String source;
        private boolean truncated;
        private Object in_reply_to_status_id;
        private Object in_reply_to_status_id_str;
        private Object in_reply_to_user_id;
        private Object in_reply_to_user_id_str;
        private Object in_reply_to_screen_name;

        private UserEntity user;
        private Object geo;
        private Object coordinates;
        private Object place;
        private Object contributors;


        private RetweetedStatusEntity retweeted_status;
        private boolean is_quote_status;
        private int retweet_count;
        private int favorite_count;
        private EntitiesEntity entities;
        private boolean favorited;
        private boolean retweeted;
        private String lang;

        public void setMetadata(MetadataEntity metadata) {
            this.metadata = metadata;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setId_str(String id_str) {
            this.id_str = id_str;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setTruncated(boolean truncated) {
            this.truncated = truncated;
        }

        public void setIn_reply_to_status_id(Object in_reply_to_status_id) {
            this.in_reply_to_status_id = in_reply_to_status_id;
        }

        public void setIn_reply_to_status_id_str(Object in_reply_to_status_id_str) {
            this.in_reply_to_status_id_str = in_reply_to_status_id_str;
        }

        public void setIn_reply_to_user_id(Object in_reply_to_user_id) {
            this.in_reply_to_user_id = in_reply_to_user_id;
        }

        public void setIn_reply_to_user_id_str(Object in_reply_to_user_id_str) {
            this.in_reply_to_user_id_str = in_reply_to_user_id_str;
        }

        public void setIn_reply_to_screen_name(Object in_reply_to_screen_name) {
            this.in_reply_to_screen_name = in_reply_to_screen_name;
        }

        public void setUser(UserEntity user) {
            this.user = user;
        }

        public void setGeo(Object geo) {
            this.geo = geo;
        }

        public void setCoordinates(Object coordinates) {
            this.coordinates = coordinates;
        }

        public void setPlace(Object place) {
            this.place = place;
        }

        public void setContributors(Object contributors) {
            this.contributors = contributors;
        }

        public void setRetweeted_status(RetweetedStatusEntity retweeted_status) {
            this.retweeted_status = retweeted_status;
        }

        public void setIs_quote_status(boolean is_quote_status) {
            this.is_quote_status = is_quote_status;
        }

        public void setRetweet_count(int retweet_count) {
            this.retweet_count = retweet_count;
        }

        public void setFavorite_count(int favorite_count) {
            this.favorite_count = favorite_count;
        }

        public void setEntities(EntitiesEntity entities) {
            this.entities = entities;
        }

        public void setFavorited(boolean favorited) {
            this.favorited = favorited;
        }

        public void setRetweeted(boolean retweeted) {
            this.retweeted = retweeted;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public MetadataEntity getMetadata() {
            return metadata;
        }

        public String getCreated_at() {
            return created_at;
        }

        public long getId() {
            return id;
        }

        public String getId_str() {
            return id_str;
        }

        public String getText() {
            return text;
        }

        public String getSource() {
            return source;
        }

        public boolean isTruncated() {
            return truncated;
        }

        public Object getIn_reply_to_status_id() {
            return in_reply_to_status_id;
        }

        public Object getIn_reply_to_status_id_str() {
            return in_reply_to_status_id_str;
        }

        public Object getIn_reply_to_user_id() {
            return in_reply_to_user_id;
        }

        public Object getIn_reply_to_user_id_str() {
            return in_reply_to_user_id_str;
        }

        public Object getIn_reply_to_screen_name() {
            return in_reply_to_screen_name;
        }

        public UserEntity getUser() {
            return user;
        }

        public Object getGeo() {
            return geo;
        }

        public Object getCoordinates() {
            return coordinates;
        }

        public Object getPlace() {
            return place;
        }

        public Object getContributors() {
            return contributors;
        }

        public RetweetedStatusEntity getRetweeted_status() {
            return retweeted_status;
        }

        public boolean isIs_quote_status() {
            return is_quote_status;
        }

        public int getRetweet_count() {
            return retweet_count;
        }

        public int getFavorite_count() {
            return favorite_count;
        }

        public EntitiesEntity getEntities() {
            return entities;
        }

        public boolean isFavorited() {
            return favorited;
        }

        public boolean isRetweeted() {
            return retweeted;
        }

        public String getLang() {
            return lang;
        }

        public static class MetadataEntity {
            private String iso_language_code;
            private String result_type;

            public void setIso_language_code(String iso_language_code) {
                this.iso_language_code = iso_language_code;
            }

            public void setResult_type(String result_type) {
                this.result_type = result_type;
            }

            public String getIso_language_code() {
                return iso_language_code;
            }

            public String getResult_type() {
                return result_type;
            }
        }

        public static class UserEntity {
            private long id;
            private String id_str;
            private String name;
            private String screen_name;
            private String location;
            private String description;
            private Object url;

            private EntitiesEntity entities;
            @SerializedName("protected")
            private boolean protectedX;
            private int followers_count;
            private int friends_count;
            private int listed_count;
            private String created_at;
            private int favourites_count;
            private Object utc_offset;
            private Object time_zone;
            private boolean geo_enabled;
            private boolean verified;
            private int statuses_count;
            private String lang;
            private boolean contributors_enabled;
            private boolean is_translator;
            private boolean is_translation_enabled;
            private String profile_background_color;
            private String profile_background_image_url;
            private String profile_background_image_url_https;
            private boolean profile_background_tile;
            private String profile_image_url;
            private String profile_image_url_https;
            private String profile_banner_url;
            private String profile_link_color;
            private String profile_sidebar_border_color;
            private String profile_sidebar_fill_color;
            private String profile_text_color;
            private boolean profile_use_background_image;
            private boolean has_extended_profile;
            private boolean default_profile;
            private boolean default_profile_image;
            private boolean following;
            private boolean follow_request_sent;
            private boolean notifications;

            public void setId(long id) {
                this.id = id;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setScreen_name(String screen_name) {
                this.screen_name = screen_name;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setUrl(Object url) {
                this.url = url;
            }

            public void setEntities(EntitiesEntity entities) {
                this.entities = entities;
            }

            public void setProtectedX(boolean protectedX) {
                this.protectedX = protectedX;
            }

            public void setFollowers_count(int followers_count) {
                this.followers_count = followers_count;
            }

            public void setFriends_count(int friends_count) {
                this.friends_count = friends_count;
            }

            public void setListed_count(int listed_count) {
                this.listed_count = listed_count;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public void setFavourites_count(int favourites_count) {
                this.favourites_count = favourites_count;
            }

            public void setUtc_offset(Object utc_offset) {
                this.utc_offset = utc_offset;
            }

            public void setTime_zone(Object time_zone) {
                this.time_zone = time_zone;
            }

            public void setGeo_enabled(boolean geo_enabled) {
                this.geo_enabled = geo_enabled;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

            public void setStatuses_count(int statuses_count) {
                this.statuses_count = statuses_count;
            }

            public void setLang(String lang) {
                this.lang = lang;
            }

            public void setContributors_enabled(boolean contributors_enabled) {
                this.contributors_enabled = contributors_enabled;
            }

            public void setIs_translator(boolean is_translator) {
                this.is_translator = is_translator;
            }

            public void setIs_translation_enabled(boolean is_translation_enabled) {
                this.is_translation_enabled = is_translation_enabled;
            }

            public void setProfile_background_color(String profile_background_color) {
                this.profile_background_color = profile_background_color;
            }

            public void setProfile_background_image_url(String profile_background_image_url) {
                this.profile_background_image_url = profile_background_image_url;
            }

            public void setProfile_background_image_url_https(String profile_background_image_url_https) {
                this.profile_background_image_url_https = profile_background_image_url_https;
            }

            public void setProfile_background_tile(boolean profile_background_tile) {
                this.profile_background_tile = profile_background_tile;
            }

            public void setProfile_image_url(String profile_image_url) {
                this.profile_image_url = profile_image_url;
            }

            public void setProfile_image_url_https(String profile_image_url_https) {
                this.profile_image_url_https = profile_image_url_https;
            }

            public void setProfile_banner_url(String profile_banner_url) {
                this.profile_banner_url = profile_banner_url;
            }

            public void setProfile_link_color(String profile_link_color) {
                this.profile_link_color = profile_link_color;
            }

            public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
                this.profile_sidebar_border_color = profile_sidebar_border_color;
            }

            public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
                this.profile_sidebar_fill_color = profile_sidebar_fill_color;
            }

            public void setProfile_text_color(String profile_text_color) {
                this.profile_text_color = profile_text_color;
            }

            public void setProfile_use_background_image(boolean profile_use_background_image) {
                this.profile_use_background_image = profile_use_background_image;
            }

            public void setHas_extended_profile(boolean has_extended_profile) {
                this.has_extended_profile = has_extended_profile;
            }

            public void setDefault_profile(boolean default_profile) {
                this.default_profile = default_profile;
            }

            public void setDefault_profile_image(boolean default_profile_image) {
                this.default_profile_image = default_profile_image;
            }

            public void setFollowing(boolean following) {
                this.following = following;
            }

            public void setFollow_request_sent(boolean follow_request_sent) {
                this.follow_request_sent = follow_request_sent;
            }

            public void setNotifications(boolean notifications) {
                this.notifications = notifications;
            }

            public long getId() {
                return id;
            }

            public String getId_str() {
                return id_str;
            }

            public String getName() {
                return name;
            }

            public String getScreen_name() {
                return screen_name;
            }

            public String getLocation() {
                return location;
            }

            public String getDescription() {
                return description;
            }

            public Object getUrl() {
                return url;
            }

            public EntitiesEntity getEntities() {
                return entities;
            }

            public boolean isProtectedX() {
                return protectedX;
            }

            public int getFollowers_count() {
                return followers_count;
            }

            public int getFriends_count() {
                return friends_count;
            }

            public int getListed_count() {
                return listed_count;
            }

            public String getCreated_at() {
                return created_at;
            }

            public int getFavourites_count() {
                return favourites_count;
            }

            public Object getUtc_offset() {
                return utc_offset;
            }

            public Object getTime_zone() {
                return time_zone;
            }

            public boolean isGeo_enabled() {
                return geo_enabled;
            }

            public boolean isVerified() {
                return verified;
            }

            public int getStatuses_count() {
                return statuses_count;
            }

            public String getLang() {
                return lang;
            }

            public boolean isContributors_enabled() {
                return contributors_enabled;
            }

            public boolean isIs_translator() {
                return is_translator;
            }

            public boolean isIs_translation_enabled() {
                return is_translation_enabled;
            }

            public String getProfile_background_color() {
                return profile_background_color;
            }

            public String getProfile_background_image_url() {
                return profile_background_image_url;
            }

            public String getProfile_background_image_url_https() {
                return profile_background_image_url_https;
            }

            public boolean isProfile_background_tile() {
                return profile_background_tile;
            }

            public String getProfile_image_url() {
                return profile_image_url;
            }

            public String getProfile_image_url_https() {
                return profile_image_url_https;
            }

            public String getProfile_banner_url() {
                return profile_banner_url;
            }

            public String getProfile_link_color() {
                return profile_link_color;
            }

            public String getProfile_sidebar_border_color() {
                return profile_sidebar_border_color;
            }

            public String getProfile_sidebar_fill_color() {
                return profile_sidebar_fill_color;
            }

            public String getProfile_text_color() {
                return profile_text_color;
            }

            public boolean isProfile_use_background_image() {
                return profile_use_background_image;
            }

            public boolean isHas_extended_profile() {
                return has_extended_profile;
            }

            public boolean isDefault_profile() {
                return default_profile;
            }

            public boolean isDefault_profile_image() {
                return default_profile_image;
            }

            public boolean isFollowing() {
                return following;
            }

            public boolean isFollow_request_sent() {
                return follow_request_sent;
            }

            public boolean isNotifications() {
                return notifications;
            }

            public static class EntitiesEntity {
                private DescriptionEntity description;

                public void setDescription(DescriptionEntity description) {
                    this.description = description;
                }

                public DescriptionEntity getDescription() {
                    return description;
                }

                public static class DescriptionEntity {
                    private List<?> urls;

                    public void setUrls(List<?> urls) {
                        this.urls = urls;
                    }

                    public List<?> getUrls() {
                        return urls;
                    }
                }
            }
        }

        public static class RetweetedStatusEntity {
            private MetadataEntity metadata;
            private String created_at;
            private long id;
            private String id_str;
            private String text;
            private String source;
            private boolean truncated;
            private Object in_reply_to_status_id;
            private Object in_reply_to_status_id_str;
            private Object in_reply_to_user_id;
            private Object in_reply_to_user_id_str;
            private Object in_reply_to_screen_name;

            private UserEntity user;
            private Object geo;
            private Object coordinates;
            private Object place;
            private Object contributors;
            private boolean is_quote_status;
            private int retweet_count;
            private int favorite_count;
            private EntitiesEntity entities;
            private boolean favorited;
            private boolean retweeted;
            private String lang;

            public void setMetadata(MetadataEntity metadata) {
                this.metadata = metadata;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public void setId(long id) {
                this.id = id;
            }

            public void setId_str(String id_str) {
                this.id_str = id_str;
            }

            public void setText(String text) {
                this.text = text;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setTruncated(boolean truncated) {
                this.truncated = truncated;
            }

            public void setIn_reply_to_status_id(Object in_reply_to_status_id) {
                this.in_reply_to_status_id = in_reply_to_status_id;
            }

            public void setIn_reply_to_status_id_str(Object in_reply_to_status_id_str) {
                this.in_reply_to_status_id_str = in_reply_to_status_id_str;
            }

            public void setIn_reply_to_user_id(Object in_reply_to_user_id) {
                this.in_reply_to_user_id = in_reply_to_user_id;
            }

            public void setIn_reply_to_user_id_str(Object in_reply_to_user_id_str) {
                this.in_reply_to_user_id_str = in_reply_to_user_id_str;
            }

            public void setIn_reply_to_screen_name(Object in_reply_to_screen_name) {
                this.in_reply_to_screen_name = in_reply_to_screen_name;
            }

            public void setUser(UserEntity user) {
                this.user = user;
            }

            public void setGeo(Object geo) {
                this.geo = geo;
            }

            public void setCoordinates(Object coordinates) {
                this.coordinates = coordinates;
            }

            public void setPlace(Object place) {
                this.place = place;
            }

            public void setContributors(Object contributors) {
                this.contributors = contributors;
            }

            public void setIs_quote_status(boolean is_quote_status) {
                this.is_quote_status = is_quote_status;
            }

            public void setRetweet_count(int retweet_count) {
                this.retweet_count = retweet_count;
            }

            public void setFavorite_count(int favorite_count) {
                this.favorite_count = favorite_count;
            }

            public void setEntities(EntitiesEntity entities) {
                this.entities = entities;
            }

            public void setFavorited(boolean favorited) {
                this.favorited = favorited;
            }

            public void setRetweeted(boolean retweeted) {
                this.retweeted = retweeted;
            }

            public void setLang(String lang) {
                this.lang = lang;
            }

            public MetadataEntity getMetadata() {
                return metadata;
            }

            public String getCreated_at() {
                return created_at;
            }

            public long getId() {
                return id;
            }

            public String getId_str() {
                return id_str;
            }

            public String getText() {
                return text;
            }

            public String getSource() {
                return source;
            }

            public boolean isTruncated() {
                return truncated;
            }

            public Object getIn_reply_to_status_id() {
                return in_reply_to_status_id;
            }

            public Object getIn_reply_to_status_id_str() {
                return in_reply_to_status_id_str;
            }

            public Object getIn_reply_to_user_id() {
                return in_reply_to_user_id;
            }

            public Object getIn_reply_to_user_id_str() {
                return in_reply_to_user_id_str;
            }

            public Object getIn_reply_to_screen_name() {
                return in_reply_to_screen_name;
            }

            public UserEntity getUser() {
                return user;
            }

            public Object getGeo() {
                return geo;
            }

            public Object getCoordinates() {
                return coordinates;
            }

            public Object getPlace() {
                return place;
            }

            public Object getContributors() {
                return contributors;
            }

            public boolean isIs_quote_status() {
                return is_quote_status;
            }

            public int getRetweet_count() {
                return retweet_count;
            }

            public int getFavorite_count() {
                return favorite_count;
            }

            public EntitiesEntity getEntities() {
                return entities;
            }

            public boolean isFavorited() {
                return favorited;
            }

            public boolean isRetweeted() {
                return retweeted;
            }

            public String getLang() {
                return lang;
            }

            public static class MetadataEntity {
                private String iso_language_code;
                private String result_type;

                public void setIso_language_code(String iso_language_code) {
                    this.iso_language_code = iso_language_code;
                }

                public void setResult_type(String result_type) {
                    this.result_type = result_type;
                }

                public String getIso_language_code() {
                    return iso_language_code;
                }

                public String getResult_type() {
                    return result_type;
                }
            }

            public static class UserEntity {
                private long id;
                private String id_str;
                private String name;
                private String screen_name;
                private String location;
                private String description;
                private String url;

                private EntitiesEntity entities;
                @SerializedName("protected")
                private boolean protectedX;
                private int followers_count;
                private int friends_count;
                private int listed_count;
                private String created_at;
                private int favourites_count;
                private int utc_offset;
                private String time_zone;
                private boolean geo_enabled;
                private boolean verified;
                private int statuses_count;
                private String lang;
                private boolean contributors_enabled;
                private boolean is_translator;
                private boolean is_translation_enabled;
                private String profile_background_color;
                private String profile_background_image_url;
                private String profile_background_image_url_https;
                private boolean profile_background_tile;
                private String profile_image_url;
                private String profile_image_url_https;
                private String profile_banner_url;
                private String profile_link_color;
                private String profile_sidebar_border_color;
                private String profile_sidebar_fill_color;
                private String profile_text_color;
                private boolean profile_use_background_image;
                private boolean has_extended_profile;
                private boolean default_profile;
                private boolean default_profile_image;
                private boolean following;
                private boolean follow_request_sent;
                private boolean notifications;

                public void setId(int id) {
                    this.id = id;
                }

                public void setId_str(String id_str) {
                    this.id_str = id_str;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setScreen_name(String screen_name) {
                    this.screen_name = screen_name;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setEntities(EntitiesEntity entities) {
                    this.entities = entities;
                }

                public void setProtectedX(boolean protectedX) {
                    this.protectedX = protectedX;
                }

                public void setFollowers_count(int followers_count) {
                    this.followers_count = followers_count;
                }

                public void setFriends_count(int friends_count) {
                    this.friends_count = friends_count;
                }

                public void setListed_count(int listed_count) {
                    this.listed_count = listed_count;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public void setFavourites_count(int favourites_count) {
                    this.favourites_count = favourites_count;
                }

                public void setUtc_offset(int utc_offset) {
                    this.utc_offset = utc_offset;
                }

                public void setTime_zone(String time_zone) {
                    this.time_zone = time_zone;
                }

                public void setGeo_enabled(boolean geo_enabled) {
                    this.geo_enabled = geo_enabled;
                }

                public void setVerified(boolean verified) {
                    this.verified = verified;
                }

                public void setStatuses_count(int statuses_count) {
                    this.statuses_count = statuses_count;
                }

                public void setLang(String lang) {
                    this.lang = lang;
                }

                public void setContributors_enabled(boolean contributors_enabled) {
                    this.contributors_enabled = contributors_enabled;
                }

                public void setIs_translator(boolean is_translator) {
                    this.is_translator = is_translator;
                }

                public void setIs_translation_enabled(boolean is_translation_enabled) {
                    this.is_translation_enabled = is_translation_enabled;
                }

                public void setProfile_background_color(String profile_background_color) {
                    this.profile_background_color = profile_background_color;
                }

                public void setProfile_background_image_url(String profile_background_image_url) {
                    this.profile_background_image_url = profile_background_image_url;
                }

                public void setProfile_background_image_url_https(String profile_background_image_url_https) {
                    this.profile_background_image_url_https = profile_background_image_url_https;
                }

                public void setProfile_background_tile(boolean profile_background_tile) {
                    this.profile_background_tile = profile_background_tile;
                }

                public void setProfile_image_url(String profile_image_url) {
                    this.profile_image_url = profile_image_url;
                }

                public void setProfile_image_url_https(String profile_image_url_https) {
                    this.profile_image_url_https = profile_image_url_https;
                }

                public void setProfile_banner_url(String profile_banner_url) {
                    this.profile_banner_url = profile_banner_url;
                }

                public void setProfile_link_color(String profile_link_color) {
                    this.profile_link_color = profile_link_color;
                }

                public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
                    this.profile_sidebar_border_color = profile_sidebar_border_color;
                }

                public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
                    this.profile_sidebar_fill_color = profile_sidebar_fill_color;
                }

                public void setProfile_text_color(String profile_text_color) {
                    this.profile_text_color = profile_text_color;
                }

                public void setProfile_use_background_image(boolean profile_use_background_image) {
                    this.profile_use_background_image = profile_use_background_image;
                }

                public void setHas_extended_profile(boolean has_extended_profile) {
                    this.has_extended_profile = has_extended_profile;
                }

                public void setDefault_profile(boolean default_profile) {
                    this.default_profile = default_profile;
                }

                public void setDefault_profile_image(boolean default_profile_image) {
                    this.default_profile_image = default_profile_image;
                }

                public void setFollowing(boolean following) {
                    this.following = following;
                }

                public void setFollow_request_sent(boolean follow_request_sent) {
                    this.follow_request_sent = follow_request_sent;
                }

                public void setNotifications(boolean notifications) {
                    this.notifications = notifications;
                }

                public long getId() {
                    return id;
                }

                public String getId_str() {
                    return id_str;
                }

                public String getName() {
                    return name;
                }

                public String getScreen_name() {
                    return screen_name;
                }

                public String getLocation() {
                    return location;
                }

                public String getDescription() {
                    return description;
                }

                public String getUrl() {
                    return url;
                }

                public EntitiesEntity getEntities() {
                    return entities;
                }

                public boolean isProtectedX() {
                    return protectedX;
                }

                public int getFollowers_count() {
                    return followers_count;
                }

                public int getFriends_count() {
                    return friends_count;
                }

                public int getListed_count() {
                    return listed_count;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public int getFavourites_count() {
                    return favourites_count;
                }

                public int getUtc_offset() {
                    return utc_offset;
                }

                public String getTime_zone() {
                    return time_zone;
                }

                public boolean isGeo_enabled() {
                    return geo_enabled;
                }

                public boolean isVerified() {
                    return verified;
                }

                public int getStatuses_count() {
                    return statuses_count;
                }

                public String getLang() {
                    return lang;
                }

                public boolean isContributors_enabled() {
                    return contributors_enabled;
                }

                public boolean isIs_translator() {
                    return is_translator;
                }

                public boolean isIs_translation_enabled() {
                    return is_translation_enabled;
                }

                public String getProfile_background_color() {
                    return profile_background_color;
                }

                public String getProfile_background_image_url() {
                    return profile_background_image_url;
                }

                public String getProfile_background_image_url_https() {
                    return profile_background_image_url_https;
                }

                public boolean isProfile_background_tile() {
                    return profile_background_tile;
                }

                public String getProfile_image_url() {
                    return profile_image_url;
                }

                public String getProfile_image_url_https() {
                    return profile_image_url_https;
                }

                public String getProfile_banner_url() {
                    return profile_banner_url;
                }

                public String getProfile_link_color() {
                    return profile_link_color;
                }

                public String getProfile_sidebar_border_color() {
                    return profile_sidebar_border_color;
                }

                public String getProfile_sidebar_fill_color() {
                    return profile_sidebar_fill_color;
                }

                public String getProfile_text_color() {
                    return profile_text_color;
                }

                public boolean isProfile_use_background_image() {
                    return profile_use_background_image;
                }

                public boolean isHas_extended_profile() {
                    return has_extended_profile;
                }

                public boolean isDefault_profile() {
                    return default_profile;
                }

                public boolean isDefault_profile_image() {
                    return default_profile_image;
                }

                public boolean isFollowing() {
                    return following;
                }

                public boolean isFollow_request_sent() {
                    return follow_request_sent;
                }

                public boolean isNotifications() {
                    return notifications;
                }

                public static class EntitiesEntity {
                    private UrlEntity url;
                    private DescriptionEntity description;

                    public void setUrl(UrlEntity url) {
                        this.url = url;
                    }

                    public void setDescription(DescriptionEntity description) {
                        this.description = description;
                    }

                    public UrlEntity getUrl() {
                        return url;
                    }

                    public DescriptionEntity getDescription() {
                        return description;
                    }

                    public static class UrlEntity {

                        private List<UrlsEntity> urls;

                        public void setUrls(List<UrlsEntity> urls) {
                            this.urls = urls;
                        }

                        public List<UrlsEntity> getUrls() {
                            return urls;
                        }

                        public static class UrlsEntity {
                            private String url;
                            private String expanded_url;
                            private String display_url;
                            private List<Integer> indices;

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public void setExpanded_url(String expanded_url) {
                                this.expanded_url = expanded_url;
                            }

                            public void setDisplay_url(String display_url) {
                                this.display_url = display_url;
                            }

                            public void setIndices(List<Integer> indices) {
                                this.indices = indices;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public String getExpanded_url() {
                                return expanded_url;
                            }

                            public String getDisplay_url() {
                                return display_url;
                            }

                            public List<Integer> getIndices() {
                                return indices;
                            }
                        }
                    }

                    public static class DescriptionEntity {
                        private List<?> urls;

                        public void setUrls(List<?> urls) {
                            this.urls = urls;
                        }

                        public List<?> getUrls() {
                            return urls;
                        }
                    }
                }
            }

            public static class EntitiesEntity {
                private List<?> hashtags;
                private List<?> symbols;
                private List<?> user_mentions;
                private List<?> urls;

                public void setHashtags(List<?> hashtags) {
                    this.hashtags = hashtags;
                }

                public void setSymbols(List<?> symbols) {
                    this.symbols = symbols;
                }

                public void setUser_mentions(List<?> user_mentions) {
                    this.user_mentions = user_mentions;
                }

                public void setUrls(List<?> urls) {
                    this.urls = urls;
                }

                public List<?> getHashtags() {
                    return hashtags;
                }

                public List<?> getSymbols() {
                    return symbols;
                }

                public List<?> getUser_mentions() {
                    return user_mentions;
                }

                public List<?> getUrls() {
                    return urls;
                }
            }
        }

        public static class EntitiesEntity {
            private List<?> hashtags;
            private List<?> symbols;
            /**
             * screen_name : QueridoJeito
             * name : Querido Jeito س
             * id : 369645502
             * id_str : 369645502
             * indices : [3,16]
             */

            private List<UserMentionsEntity> user_mentions;
            private List<?> urls;

            public void setHashtags(List<?> hashtags) {
                this.hashtags = hashtags;
            }

            public void setSymbols(List<?> symbols) {
                this.symbols = symbols;
            }

            public void setUser_mentions(List<UserMentionsEntity> user_mentions) {
                this.user_mentions = user_mentions;
            }

            public void setUrls(List<?> urls) {
                this.urls = urls;
            }

            public List<?> getHashtags() {
                return hashtags;
            }

            public List<?> getSymbols() {
                return symbols;
            }

            public List<UserMentionsEntity> getUser_mentions() {
                return user_mentions;
            }

            public List<?> getUrls() {
                return urls;
            }

            public static class UserMentionsEntity {
                private String screen_name;
                private String name;
                private long id;
                private String id_str;
                private List<Integer> indices;

                public void setScreen_name(String screen_name) {
                    this.screen_name = screen_name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public void setId_str(String id_str) {
                    this.id_str = id_str;
                }

                public void setIndices(List<Integer> indices) {
                    this.indices = indices;
                }

                public String getScreen_name() {
                    return screen_name;
                }

                public String getName() {
                    return name;
                }

                public long getId() {
                    return id;
                }

                public String getId_str() {
                    return id_str;
                }

                public List<Integer> getIndices() {
                    return indices;
                }
            }
        }
    }
}
