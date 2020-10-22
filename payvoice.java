package day3exerciseswithsir; 

	public class payvoice implements Payable{
		String partNum;
		String Description;
		int quality;
		double pricePerItem;
		public payvoice(String partNum, String Description, int quality, double pricePerItem) {
			this.partNum = partNum;
			this.Description = Description;
			this.quality = quality;
			this.pricePerItem = pricePerItem;
		}
		public String getPartNum() {
			return partNum;
		}
		public void setPartNum(String partNum) {
			this.partNum = partNum;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String partDescription) {
			this.Description = partDescription;
		}
		public int getQuality() {
			return quality;
		}
		public void setQuality(int quality) {
			this.quality = quality;
		}
		public double getPricePayPerItem() {
			return pricePerItem;
		}
		public void setPricePayPerItem(double pricePayPerItem) {
			this.pricePerItem = pricePayPerItem;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Invoice [partNum=");
			builder.append(partNum);
			builder.append("partDescription=");
			builder.append(Description);
			builder.append("quality=");
			builder.append(quality);
			builder.append("pricePayPerItem=");
			builder.append(pricePerItem);
			return builder.toString();
		}
		@Override
		public double getPayment() {
			System.out.println(this.toString());
			return getQuality()*getPricePayPerItem();
		}
		
	}
