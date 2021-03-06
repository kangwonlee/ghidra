/* ###
 * IP: GHIDRA
 * REVIEWED: YES
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.pcodeCPort.slghsymbol;

import ghidra.pcodeCPort.context.FixedHandle;
import ghidra.pcodeCPort.context.ParserWalker;
import ghidra.pcodeCPort.slghpatexpress.PatternExpression;
import ghidra.sleigh.grammar.Location;

import java.io.PrintStream;

// This is the central sleigh object
public abstract class TripleSymbol extends SleighSymbol {

	public TripleSymbol(Location location) {
		super(location);
	}

	public TripleSymbol(Location location, String nm) {
		super(location, nm);
	}

	public abstract PatternExpression getPatternExpression();

	public abstract void getFixedHandle(FixedHandle hand, ParserWalker pos);

	public int getSize() {
		return 0;
	} // Size out of context

	public abstract void print(PrintStream s, ParserWalker pos);

	public Constructor resolve(ParserWalker pos) {
		return null;
	}

}
