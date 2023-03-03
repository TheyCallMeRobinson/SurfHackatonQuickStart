package cs.vsu.ru.data.mapper

import cs.vsu.ru.data.model.response.TestResponseDto
import cs.vsu.ru.domain.model.TestResponseEntity

class TestResponseMapper {
    fun entityToDto(entity: TestResponseEntity?): TestResponseDto {
        return TestResponseDto(result = "result")
    }
}