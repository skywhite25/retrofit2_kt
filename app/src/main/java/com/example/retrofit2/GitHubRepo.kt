package com.example.retrofit2

import com.google.gson.annotations.SerializedName

data class GitHubRepo(@SerializedName("name") val name : String) {
}