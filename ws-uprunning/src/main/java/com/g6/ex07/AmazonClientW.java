package com.g6.ex07;

import java.util.List;

import javax.xml.ws.Holder;

import utils.aws.AWSECommerceService;
import utils.aws.AWSECommerceServicePortType;
import utils.aws.Item;
import utils.aws.ItemSearch;
import utils.aws.ItemSearchRequest;
import utils.aws.Items;
import utils.aws.OperationRequest;

class AmazonClientW { // W is for Wrapped style
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Usage: java AmazonClientW <access key>");
			return;
		}
		final String access_key = args[0];
		// Construct a service object to get the port object.
		AWSECommerceService service = new AWSECommerceService();
		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();
		// Construct an empty request object and then add details.
		ItemSearchRequest request = new ItemSearchRequest();
		request.setSearchIndex("Books");
		request.setKeywords("quantum gravity");
		ItemSearch search = new ItemSearch();
		search.getRequest().add(request);
		search.setAWSAccessKeyId(access_key);
		Holder<OperationRequest> operation_request = null;
		Holder<List<Items>> items = new Holder<List<Items>>();
//		port.itemSearch(search.getMarketplaceDomain(), search.getAWSAccessKeyId(), search.getSubscriptionId(),
//				search.getAssociateTag(), search.getXMLEscaping(), search.getValidate(), search.getShared(),
//				search.getRequest(), operation_request, items);
		// Unpack the response to print the book titles.
		Items retval = items.value.get(0); // first and only Items element
		List<Item> item_list = retval.getItem(); // list of Item subelements
		for (Item item : item_list) // each Item in the list
			System.out.println(item.getItemAttributes().getTitle());
	}
}