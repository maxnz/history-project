package pages.pageutils

import pages.ExamplePage
import pages.ExamplePage2
import pages.Kindertransport

enum class PageGroup(
    val pages: List<Page>
) {
    YRS_1940_1944(listOf(Kindertransport)),
    YRS_1945_1949(listOf(ExamplePage, ExamplePage2)),
    YRS_1950_1954(listOf(ExamplePage2, ExamplePage2, ExamplePage2)),
    YRS_1955_1959(listOf(ExamplePage, ExamplePage)),
    YRS_1960_1964(listOf(ExamplePage, ExamplePage2, ExamplePage2, ExamplePage));

    override fun toString() =
        super.toString().removePrefix("YRS_").replace("_", "-")
}