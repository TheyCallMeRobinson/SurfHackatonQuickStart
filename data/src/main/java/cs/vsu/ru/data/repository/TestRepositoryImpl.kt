package cs.vsu.ru.data.repository

import cs.vsu.ru.data.service.TestService
import cs.vsu.ru.domain.model.TestRequestEntity
import cs.vsu.ru.domain.model.TestResponseEntity
import cs.vsu.ru.domain.repository.TestRepository

class TestRepositoryImpl(private val service: TestService): TestRepository {

    override fun getData(): TestResponseEntity? {
        TODO("Not yet implemented")
    }

    override fun postData(request: TestRequestEntity): TestResponseEntity {
        TODO("Not yet implemented")
    }
}