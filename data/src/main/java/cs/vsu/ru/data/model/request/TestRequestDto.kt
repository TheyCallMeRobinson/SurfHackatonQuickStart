package cs.vsu.ru.data.model.request

import com.google.gson.annotations.SerializedName

data class TestRequestDto(
    @SerializedName(value = "result") val result: String
)