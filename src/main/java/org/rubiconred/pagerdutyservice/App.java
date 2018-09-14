package org.rubiconred.pagerdutyservice;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String token=null;
    	if(args!=null && args.length > 0 ) {
			for(int argsIndex=0;argsIndex<args.length;argsIndex++) {
				if(args[argsIndex].equalsIgnoreCase("-apiToken")){
					token = args[argsIndex+1];
				}
			}
		}
		if(token == null) {
			throw new Exception("apiToken is not supplied. Please provide in the format -apiToken <apiTokenValue>");
		}
        PagerDutyService pgs = new PagerDutyService(token);
        pgs.getServices();
    }
}
