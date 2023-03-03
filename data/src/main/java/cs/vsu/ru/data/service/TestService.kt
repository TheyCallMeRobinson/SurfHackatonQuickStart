package cs.vsu.ru.data.service

import cs.vsu.ru.data.model.request.TestRequestDto
import cs.vsu.ru.data.model.response.TestResponseDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface TestService {
    @GET("api/data/{id}")
    fun getData(@Path(value = "id") id: String): Call<TestResponseDto>

    @POST("api/data")
    fun postData(@Body request: TestRequestDto): Call<TestResponseDto>
}