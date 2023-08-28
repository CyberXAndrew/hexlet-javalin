@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

@template.layout.main(course = @`
    <h1 class="text-body-emphasis">${page.getCourse().getName()}</h1>
    <p>${page.getCourse().getDescription()}</p>
    `
)
