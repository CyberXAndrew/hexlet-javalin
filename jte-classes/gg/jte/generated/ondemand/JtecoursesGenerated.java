package gg.jte.generated.ondemand;
import org.example.hexlet.dto.courses.CoursesPage;
public final class JtecoursesGenerated {
	public static final String JTE_NAME = "courses.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,4,4,5,5,5,6,6,8,8,9,9,11,11,11,11,11,11,11,12,12,12,14,14,15,15,16,16,16,17};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h2>");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(page.getHeader());
				jteOutput.writeContent("</h2>\n    ");
				if (page.getCourses().isEmpty()) {
					jteOutput.writeContent("\n        <p>Пока не добавлено ни одного курса</p>\n    ");
				} else {
					jteOutput.writeContent("\n        ");
					for (var course : page.getCourses()) {
						jteOutput.writeContent("\n            <div>\n                <h3><a href=\"/courses/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(course.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(course.getName());
						jteOutput.writeContent("</a></h3>\n                <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(course.getDescription());
						jteOutput.writeContent("</p>\n            </div>\n        ");
					}
					jteOutput.writeContent("\n    ");
				}
				jteOutput.writeContent("\n    ");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
