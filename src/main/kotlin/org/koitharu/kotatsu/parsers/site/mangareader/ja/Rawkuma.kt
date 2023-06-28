package org.koitharu.kotatsu.parsers.site.mangareader.ja

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("RAWKUMA", "Rawkuma", "ja")
internal class Rawkuma(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.RAWKUMA, pageSize = 54, searchPageSize = 54) {
	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("rawkuma.com")

	override val listUrl: String get() = "/manga"
	override val tableMode: Boolean get() = false

	override val chapterDateFormat: SimpleDateFormat = SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH)
}
