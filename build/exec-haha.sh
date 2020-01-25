
    #!/bin/bash
    # Basic while loop
    counter=1
    while [ $counter -le 1000 ]
    do
    java -jar capriccio.jar ../examples/testcase3.math
    ((counter++))
    done
    echo All done

