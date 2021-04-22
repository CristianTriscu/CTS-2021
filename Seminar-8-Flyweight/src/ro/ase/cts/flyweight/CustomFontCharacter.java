package ro.ase.cts.flyweight;

public class CustomFontCharacter implements CustomCharacter {

	private String fontName;
	private int fontSize;
	private boolean isBold;
	private boolean isItalic;
	private boolean isUnderlined;
	private char character;
	
	

	public CustomFontCharacter(String fontName, int fontSize, char character) {
		super();
		this.fontName = fontName;
		this.fontSize = fontSize;
		this.character = character;
	}

	@Override
	public void displayCharacter(TemporaryState t) {
		System.out.println(character + " @ " + t.getX() + " " + t.getY()+
				" font "+fontName);
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public boolean isBold() {
		return isBold;
	}

	public void setBold(boolean isBold) {
		this.isBold = isBold;
	}

	public boolean isItalic() {
		return isItalic;
	}

	public void setItalic(boolean isItalic) {
		this.isItalic = isItalic;
	}

	public boolean isUnderlined() {
		return isUnderlined;
	}

	public void setUnderlined(boolean isUnderlined) {
		this.isUnderlined = isUnderlined;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}
	

}
