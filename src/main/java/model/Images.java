package model;

public class Images {
   private String img_item;

   public Images(String img_item) {
      this.img_item = img_item;
   }

   public Images() {

   }

   public String getImg_item() {
      return img_item;
   }

   public void setImg_item(String img_item) {
      this.img_item = img_item;
   }

   @Override
   public String toString() {
      return "Images{" +
              "img_item='" + img_item + '\'' +
              '}';
   }
}
