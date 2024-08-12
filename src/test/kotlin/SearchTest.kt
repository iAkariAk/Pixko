
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeAll
import top.kagg886.pixko.PixivAccount
import top.kagg886.pixko.module.search.searchIllust
import top.kagg886.pixko.module.search.searchTag
import top.kagg886.pixko.module.search.searchUser
import kotlin.test.Test

class SearchTest {
    @Test
    fun testSearchIllust(): Unit = runBlocking {
        for (i in 1..3) {
            client.searchIllust("原神").apply {
                println(this.illusts)
            }
        }
    }

    @Test
    fun testSearchTag():Unit = runBlocking {
        println(client.searchTag("长筒"))
    }

    @Test
    fun testSearchUser(): Unit = runBlocking {
        println(
            client.searchUser("a").size
        )
    }

    companion object {
        lateinit var client: PixivAccount

        @JvmStatic
        @BeforeAll
        fun preparePixivClient() {
            client = AuthTest.generatePixivAccount()
        }
    }
}