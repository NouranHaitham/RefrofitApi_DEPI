package com.example.retrofitapi

import javax.inject.Inject

class AlbumRepo @Inject constructor(private val apiService: ApiService) {
    suspend fun getAlbums():List<Album>{
        return apiService.getAlbum()

    }
}