<h3>steps for creating simple hazelcast server and hazelcast client:</h3>
1-pull both the hazelcast image and hazelcast man center from docker hub.<br />
2-run the images through Docker Desktop (or terminal) and make sure to map container port to host machine port.<br />
3-search for hazelcast dependency through maven central and add it to java project.<br />
4-create a person class<br />
5-create client configuration and add hazelcast address to it and create hazelcastInstance in java.<br />
6-create for loops for putting and getting person object from hazelcast.<br />
7-connect hazelcast man central to your hazelcast instance cluster, Hint: use ip address instead of localhost keyword when connecting.<br />
8-analyze put and get operations through hazelcast man central.<br />
