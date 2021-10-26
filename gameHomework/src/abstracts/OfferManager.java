package abstracts;

import offers.BaseOffer;

public class OfferManager implements BaseOffer {

	@Override
	public void offerAdd() {
		System.out.println("kampanya eklendi");

	}

	@Override
	public void offerDelete() {
		System.out.println("kampanya silindi");

	}

	@Override
	public void offerUpdate() {
		System.out.println("kampanya guncellendi");

	}

}
