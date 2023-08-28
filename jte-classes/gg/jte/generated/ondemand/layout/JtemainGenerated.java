package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,21,21,21,23,23,24,24,24,25,25,25,26,26,32};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content course, Content courses) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n    <head>\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n              crossorigin=\"anonymous\">\n        <meta charset=\"utf-8\" />\n        <meta name=\"viewport\" content=\"width=device-width initial-scale=1\" />\n        <title>Layout example</title>\n    </head>\n    <body>\n        <div>\n            <h2>Заголовок</h2>\n            <a href=\"https://ru.hexlet.io/\" title=\"Hexlet\">Hexlet</a>\n        </div>\n        <main>\n            ");
		if (course == null && courses == null) {
			jteOutput.writeContent("\n                <p>Шаблон основной страницы</p>\n            ");
		} else {
			jteOutput.writeContent("\n                ");
			jteOutput.setContext("main", null);
			jteOutput.writeUserContent(course);
			jteOutput.writeContent("\n                ");
			jteOutput.setContext("main", null);
			jteOutput.writeUserContent(courses);
			jteOutput.writeContent("\n            ");
		}
		jteOutput.writeContent("\n        </main>\n        <div class=\"footer\">\n            <a href=\"https://github.com/CyberXAndrew\">My GitHub</a>\n        </div>\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content course = (Content)params.getOrDefault("course", null);
		Content courses = (Content)params.getOrDefault("courses", null);
		render(jteOutput, jteHtmlInterceptor, course, courses);
	}
}
