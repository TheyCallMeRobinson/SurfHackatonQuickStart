package cs.vsu.ru.data.model.response

import com.google.gson.annotations.SerializedName

data class TestResponseDto(
    @SerializedName(value = "result") val result: String
)