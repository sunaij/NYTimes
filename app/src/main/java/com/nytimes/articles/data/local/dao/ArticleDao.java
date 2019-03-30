package com.nytimes.articles.data.local.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.nytimes.articles.data.local.entity.ArticleEntity;

import java.util.List;

/**
 * File Description
 * <p>
 * Author: Sunaij Iqbal
 * Created: 30/03/2019
 * Modified: 30/03/2019
 */
@Dao
public interface ArticleDao {
    @Query("SELECT * FROM articles")
    LiveData<List<ArticleEntity>> loadPopularArticles();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveArticles(List<ArticleEntity> articleEntities);

}
