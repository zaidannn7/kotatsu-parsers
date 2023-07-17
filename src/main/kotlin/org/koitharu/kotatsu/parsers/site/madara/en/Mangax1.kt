package org.koitharu.kotatsu.parsers.site.madara.pt

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAX1", "Mangax1", "en")
internal class Mangax1(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGAX1, "mangax1.com") {

	override val postreq = true
}
