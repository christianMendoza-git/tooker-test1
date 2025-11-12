import data.Team
import com.example.myapplication.R


class Datasource {
    fun loadFlowers(): List<Team> {
        return listOf<Team>(
            Team(R.string.flower_1, R.drawable.download),
            Team(R.string.flower_2, R.drawable.download_1),
            Team(R.string.flower_3, R.drawable.download_2),
            Team(R.string.flower_4, R.drawable.download_3),
            Team(R.string.flower_5, R.drawable.download_4),
            Team(R.string.flower_6, R.drawable.download_5),
            Team(R.string.flower_7, R.drawable.download_6),
            Team(R.string.flower_8, R.drawable.download_7),
            Team(R.string.flower_9, R.drawable.download_8),
            Team(R.string.flower_10, R.drawable.download_9),
            Team(R.string.flower_11, R.drawable.download_10)
        )
    }
}