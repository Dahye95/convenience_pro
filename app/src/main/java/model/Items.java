package model;

public class Items
{
    private String img;

    private String item_idx;

    private String price;

    private String title;

    public String getImg ()
    {
        return img;
    }

    public void setImg (String img)
    {
        this.img = img;
    }

    public String getItem_idx ()
    {
        return item_idx;
    }

    public void setItem_idx (String item_idx)
    {
        this.item_idx = item_idx;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [img = "+img+", item_idx = "+item_idx+", price = "+price+", title = "+title+"]";
    }
}
			