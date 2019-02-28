/*
    Copyright 2019 Sergejs Vinniks

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package simplegrammar;

/**
 *
 * @author s.vinniks
 */
public class Token {

    private final String name;
    private final String value;

    private String source;
    private Integer line;
    private Integer position;
    
    public Token(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Token(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}
