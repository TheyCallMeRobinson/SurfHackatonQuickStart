package cs.vsu.ru.domain.repository

import cs.vsu.ru.domain.model.TestRequestEntity
import cs.vsu.ru.domain.model.TestResponseEntity

interface TestRepository {
    fun getData(): TestResponseEntity?
    fun postData(request: TestRequestEntity): TestResponseEntity?
}