/*
Copyright (c) 2012 Anant Bhardwaj

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package edu.stanford.voicex;

/**
 * @author Anant Bhardwaj
 * @date May 13, 2012
 *
 */
public class SMSRequestCollectorThread extends Thread {
	VoiceX v;
	String number;
	String text;
	long delay = 0;		
	
	public SMSRequestCollectorThread(VoiceX v, String number, String text, long delay){
		this.v = v;
		this.number = number;
		this.text = text;
		this.delay  = delay;
	}
	
	public void run() {		
		try{
			Thread.sleep(delay);
		}catch(InterruptedException ie){
		}			
		v.sendSMS(number, text);
	}
}
