package org.koitharu.kotatsu.parsers.site.mangareader.id

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("KUMAPOI", "KumaPoi", "id")
internal class KumaPoiParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.KUMAPOI, pageSize = 20, searchPageSize = 10) {
	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("kumapoi.me")

	override val listUrl: String
		get() = "/manga"
	override val tableMode: Boolean
		get() = true

	override val chapterDateFormat: SimpleDateFormat = SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH)
}
