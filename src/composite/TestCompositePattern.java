package composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag body = new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");

        parentTag.addChildTag(body);

        HtmlTag childOne = new HtmlElement("<p>");
        childOne.setStartTag("<p>");
        childOne.setEndTag("</p>");
        childOne.setTagBody("Testing html tag library");
        body.addChildTag(childOne);

        childOne = new HtmlElement("<p>");
        childOne.setStartTag("<p>");
        childOne.setEndTag("</p>");
        childOne.setTagBody("Paragraph 2");
        body.addChildTag(childOne);

        parentTag.generateHtml();
    }
}
