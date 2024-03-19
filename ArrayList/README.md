## ArrayList

- ArrayList is a part of java **Collection Framework**.
- ArrayList is a dynamic array of object.
- We can not create an array list of the primitive types, such as ```int, float, char, etc```. It is required to use the required wrapper class in such cases.
- ArrayList can contain duplicates elements.
- ArrayList allows random access because the [Array](../Array/README.md) works on an index basis.
- ArrayList manipulation is a little bit slower than LinkedList because lots of shifting needs to occur if any elements is removed from the ArrayList.

## Declaration

- ```ArrayList<int> intList = new ArrayList<>(); // does not work```
- ```ArrayList<Integer> intList = new ArrayList<>(); // works fine```
- ```ArrayList<String> strList = new ArrayList<>(); // works fine```
> **Note**: The **Integer** wrapper class was Used in place of primitive datatype.

## Difference between Array and ArrayList

<table>
    <thead>
        <th>Index</th>
        <th>Array</th>
        <th>ArrayList</th>
    </thead>
    <tbody>
        <tr>
            <td>1</td>
            <td>It's natural data structure.</td>
            <td>It's collection framework.</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Fixed size.</td>
            <td>Size grow and shrink.</td>
        </tr>
        <tr>
            <td>3</td>
            <td>It's hold primitive data types.</td>
            <td>It's hold objects.</td>
        </tr>
    </tbody>
</table>

## Topic

<table>
    <thead>
        <th>Index</th>
        <th>Topic</th>
    </thead>
    <tbody>
        <tr>
            <td>1</td>
            <td><a href="Intro.java">Introduction</a></td>
        </tr>
        <tr>
            <td>2</td>
            <td><a href="RemoveEven.java">RemoveEven Elements from ArrayList</a></td>
        </tr>
    </tbody>
</table>