
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeAll
import top.kagg886.pixko.PixivAccount
import top.kagg886.pixko.module.illust.*
import top.kagg886.pixko.module.loadImage
import kotlin.test.Test

class IllustTest {

    @Test
    fun testLoadImage():Unit = runBlocking {
        val stream = client.loadImage("https://i.pximg.net/c/540x540_70/img-master/img/2024/08/10/16/13/07/121356207_p0_master1200.jpg")

        println(stream.size)
    }

    @Test
    fun testFollow():Unit = runBlocking {
        println(client.getIllustFollowList())
    }
    @Test
    fun testIllustRecommend(): Unit = runBlocking {
        for (i in 1..3) {
            val next = client.getRecommendIllust()
            println(next)
        }
    }

    @Test
    fun testRank(): Unit = runBlocking {
        for (i in 1..3) {
            client.getRankIllust(RankCategory.ORIGINAL, i).apply {
                println(this)
            }
        }
    }

    @Test
    fun testIllustDetail(): Unit = runBlocking {
        val k = client.getIllustDetail(85297928)
        println(k)
    }

    @Test
    fun testBookmark():Unit = runBlocking {
        assert(client.bookmarkIllust(85297928))
    }

    @Test
    fun testDeleteBookmark():Unit = runBlocking {
        client.deleteBookmarkIllust(85297928)
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