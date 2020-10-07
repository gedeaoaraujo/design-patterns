<h1>Flyweight Pattern</h1>

<p>This pattern is used for:</p>

<ul>
    <li>
         An application uses a large number of objects.
    </li>
    <li>
        Storage costs are high because of the sheer quantity of objects.
    </li>
    <li>
        Most object state can be made extrinsic.
    </li>
    <li>
        Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed
    </li>
    <li>
        The application doesn’t depend on object identity. Since flyweight objects may be shared, identity tests will return true for
        conceptually distinct objects.
    </li>
</ul>