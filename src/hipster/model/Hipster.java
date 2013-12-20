package hipster.model;

public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String[] hipsterBooks;

	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "cody";
		hipsterType = "Teacher Hipster";
		hipsterPhrase = "Cheezy";

		fillTheBooks();

	}

	public Hipster(String name, String hipsterType, String hipsterPhrase, String[] hipsterBook)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getHipsterType()
	{
		return hipsterType;
	}

	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	private void fillTheBooks()
	{

		hipsterBooks[0] = "holes";
		hipsterBooks[1] = " mice of man";
		hipsterBooks[2] = "charlie and the chocolat factory";
		hipsterBooks[3] = "Hunger games";
		hipsterBooks[4] = " book";
	}

	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
}