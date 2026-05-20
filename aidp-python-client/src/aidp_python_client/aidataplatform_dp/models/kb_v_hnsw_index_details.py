# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KbVHnswIndexDetails(object):
    """
    HNSW (Hierarchical Navigable Small World) index parameters
    """

    #: A constant which can be used with the distance property of a KbVHnswIndexDetails.
    #: This constant has a value of "COSINE"
    DISTANCE_COSINE = "COSINE"

    #: A constant which can be used with the distance property of a KbVHnswIndexDetails.
    #: This constant has a value of "EUCLIDEAN"
    DISTANCE_EUCLIDEAN = "EUCLIDEAN"

    #: A constant which can be used with the distance property of a KbVHnswIndexDetails.
    #: This constant has a value of "L2_SQUARED"
    DISTANCE_L2_SQUARED = "L2_SQUARED"

    #: A constant which can be used with the distance property of a KbVHnswIndexDetails.
    #: This constant has a value of "DOT"
    DISTANCE_DOT = "DOT"

    #: A constant which can be used with the distance property of a KbVHnswIndexDetails.
    #: This constant has a value of "MANHATTAN"
    DISTANCE_MANHATTAN = "MANHATTAN"

    #: A constant which can be used with the distance property of a KbVHnswIndexDetails.
    #: This constant has a value of "HAMMING"
    DISTANCE_HAMMING = "HAMMING"

    #: A constant which can be used with the distance property of a KbVHnswIndexDetails.
    #: This constant has a value of "JACCARD"
    DISTANCE_JACCARD = "JACCARD"

    def __init__(self, **kwargs):
        """
        Initializes a new KbVHnswIndexDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param distance:
            The value to assign to the distance property of this KbVHnswIndexDetails.
            Allowed values for this property are: "COSINE", "EUCLIDEAN", "L2_SQUARED", "DOT", "MANHATTAN", "HAMMING", "JACCARD"
        :type distance: str

        :param target_accuracy:
            The value to assign to the target_accuracy property of this KbVHnswIndexDetails.
        :type target_accuracy: int

        :param neighbors:
            The value to assign to the neighbors property of this KbVHnswIndexDetails.
        :type neighbors: int

        :param ef_construction:
            The value to assign to the ef_construction property of this KbVHnswIndexDetails.
        :type ef_construction: int

        """
        self.swagger_types = {
            'distance': 'str',
            'target_accuracy': 'int',
            'neighbors': 'int',
            'ef_construction': 'int'
        }

        self.attribute_map = {
            'distance': 'distance',
            'target_accuracy': 'targetAccuracy',
            'neighbors': 'neighbors',
            'ef_construction': 'efConstruction'
        }

        self._distance = None
        self._target_accuracy = None
        self._neighbors = None
        self._ef_construction = None

    @property
    def distance(self):
        """
        Gets the distance of this KbVHnswIndexDetails.
        Distance metric for the vector index

        Allowed values for this property are: "COSINE", "EUCLIDEAN", "L2_SQUARED", "DOT", "MANHATTAN", "HAMMING", "JACCARD"


        :return: The distance of this KbVHnswIndexDetails.
        :rtype: str
        """
        return self._distance

    @distance.setter
    def distance(self, distance):
        """
        Sets the distance of this KbVHnswIndexDetails.
        Distance metric for the vector index


        :param distance: The distance of this KbVHnswIndexDetails.
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
        Gets the target_accuracy of this KbVHnswIndexDetails.
        Target accuracy percentage for the index (1-100)


        :return: The target_accuracy of this KbVHnswIndexDetails.
        :rtype: int
        """
        return self._target_accuracy

    @target_accuracy.setter
    def target_accuracy(self, target_accuracy):
        """
        Sets the target_accuracy of this KbVHnswIndexDetails.
        Target accuracy percentage for the index (1-100)


        :param target_accuracy: The target_accuracy of this KbVHnswIndexDetails.
        :type: int
        """
        self._target_accuracy = target_accuracy

    @property
    def neighbors(self):
        """
        Gets the neighbors of this KbVHnswIndexDetails.
        Maximum number of neighbors each vector can have on any layer (M parameter)


        :return: The neighbors of this KbVHnswIndexDetails.
        :rtype: int
        """
        return self._neighbors

    @neighbors.setter
    def neighbors(self, neighbors):
        """
        Sets the neighbors of this KbVHnswIndexDetails.
        Maximum number of neighbors each vector can have on any layer (M parameter)


        :param neighbors: The neighbors of this KbVHnswIndexDetails.
        :type: int
        """
        self._neighbors = neighbors

    @property
    def ef_construction(self):
        """
        Gets the ef_construction of this KbVHnswIndexDetails.
        Maximum number of closest vector candidates considered during index construction


        :return: The ef_construction of this KbVHnswIndexDetails.
        :rtype: int
        """
        return self._ef_construction

    @ef_construction.setter
    def ef_construction(self, ef_construction):
        """
        Sets the ef_construction of this KbVHnswIndexDetails.
        Maximum number of closest vector candidates considered during index construction


        :param ef_construction: The ef_construction of this KbVHnswIndexDetails.
        :type: int
        """
        self._ef_construction = ef_construction

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
