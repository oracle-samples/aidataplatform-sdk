# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KbVIvfIndexDetails(object):
    """
    IVF (Inverted File Flat) index parameters
    """

    #: A constant which can be used with the distance property of a KbVIvfIndexDetails.
    #: This constant has a value of "COSINE"
    DISTANCE_COSINE = "COSINE"

    #: A constant which can be used with the distance property of a KbVIvfIndexDetails.
    #: This constant has a value of "EUCLIDEAN"
    DISTANCE_EUCLIDEAN = "EUCLIDEAN"

    #: A constant which can be used with the distance property of a KbVIvfIndexDetails.
    #: This constant has a value of "L2_SQUARED"
    DISTANCE_L2_SQUARED = "L2_SQUARED"

    #: A constant which can be used with the distance property of a KbVIvfIndexDetails.
    #: This constant has a value of "DOT"
    DISTANCE_DOT = "DOT"

    #: A constant which can be used with the distance property of a KbVIvfIndexDetails.
    #: This constant has a value of "MANHATTAN"
    DISTANCE_MANHATTAN = "MANHATTAN"

    #: A constant which can be used with the distance property of a KbVIvfIndexDetails.
    #: This constant has a value of "HAMMING"
    DISTANCE_HAMMING = "HAMMING"

    #: A constant which can be used with the distance property of a KbVIvfIndexDetails.
    #: This constant has a value of "JACCARD"
    DISTANCE_JACCARD = "JACCARD"

    def __init__(self, **kwargs):
        """
        Initializes a new KbVIvfIndexDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param distance:
            The value to assign to the distance property of this KbVIvfIndexDetails.
            Allowed values for this property are: "COSINE", "EUCLIDEAN", "L2_SQUARED", "DOT", "MANHATTAN", "HAMMING", "JACCARD"
        :type distance: str

        :param target_accuracy:
            The value to assign to the target_accuracy property of this KbVIvfIndexDetails.
        :type target_accuracy: int

        :param neighbor_partitions:
            The value to assign to the neighbor_partitions property of this KbVIvfIndexDetails.
        :type neighbor_partitions: int

        :param neighbor_partition_probes:
            The value to assign to the neighbor_partition_probes property of this KbVIvfIndexDetails.
        :type neighbor_partition_probes: int

        """
        self.swagger_types = {
            'distance': 'str',
            'target_accuracy': 'int',
            'neighbor_partitions': 'int',
            'neighbor_partition_probes': 'int'
        }

        self.attribute_map = {
            'distance': 'distance',
            'target_accuracy': 'targetAccuracy',
            'neighbor_partitions': 'neighborPartitions',
            'neighbor_partition_probes': 'neighborPartitionProbes'
        }

        self._distance = None
        self._target_accuracy = None
        self._neighbor_partitions = None
        self._neighbor_partition_probes = None

    @property
    def distance(self):
        """
        Gets the distance of this KbVIvfIndexDetails.
        Distance metric for the vector index

        Allowed values for this property are: "COSINE", "EUCLIDEAN", "L2_SQUARED", "DOT", "MANHATTAN", "HAMMING", "JACCARD"


        :return: The distance of this KbVIvfIndexDetails.
        :rtype: str
        """
        return self._distance

    @distance.setter
    def distance(self, distance):
        """
        Sets the distance of this KbVIvfIndexDetails.
        Distance metric for the vector index


        :param distance: The distance of this KbVIvfIndexDetails.
        :type: str
        """
        allowed_values = ["COSINE", "EUCLIDEAN", "L2_SQUARED", "DOT", "MANHATTAN", "HAMMING", "JACCARD"]
        if not value_allowed_none_or_none_sentinel(distance, allowed_values):
            raise ValueError(
                "Invalid value for `distance`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._distance = distance

    @property
    def target_accuracy(self):
        """
        Gets the target_accuracy of this KbVIvfIndexDetails.
        Target accuracy percentage for the index (1-100)


        :return: The target_accuracy of this KbVIvfIndexDetails.
        :rtype: int
        """
        return self._target_accuracy

    @target_accuracy.setter
    def target_accuracy(self, target_accuracy):
        """
        Sets the target_accuracy of this KbVIvfIndexDetails.
        Target accuracy percentage for the index (1-100)


        :param target_accuracy: The target_accuracy of this KbVIvfIndexDetails.
        :type: int
        """
        self._target_accuracy = target_accuracy

    @property
    def neighbor_partitions(self):
        """
        Gets the neighbor_partitions of this KbVIvfIndexDetails.
        Number of partitions (clusters) to divide the vector data into


        :return: The neighbor_partitions of this KbVIvfIndexDetails.
        :rtype: int
        """
        return self._neighbor_partitions

    @neighbor_partitions.setter
    def neighbor_partitions(self, neighbor_partitions):
        """
        Sets the neighbor_partitions of this KbVIvfIndexDetails.
        Number of partitions (clusters) to divide the vector data into


        :param neighbor_partitions: The neighbor_partitions of this KbVIvfIndexDetails.
        :type: int
        """
        self._neighbor_partitions = neighbor_partitions

    @property
    def neighbor_partition_probes(self):
        """
        Gets the neighbor_partition_probes of this KbVIvfIndexDetails.
        Maximum number of partitions to probe during a search. Higher values increase accuracy but may reduce performance


        :return: The neighbor_partition_probes of this KbVIvfIndexDetails.
        :rtype: int
        """
        return self._neighbor_partition_probes

    @neighbor_partition_probes.setter
    def neighbor_partition_probes(self, neighbor_partition_probes):
        """
        Sets the neighbor_partition_probes of this KbVIvfIndexDetails.
        Maximum number of partitions to probe during a search. Higher values increase accuracy but may reduce performance


        :param neighbor_partition_probes: The neighbor_partition_probes of this KbVIvfIndexDetails.
        :type: int
        """
        self._neighbor_partition_probes = neighbor_partition_probes

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
