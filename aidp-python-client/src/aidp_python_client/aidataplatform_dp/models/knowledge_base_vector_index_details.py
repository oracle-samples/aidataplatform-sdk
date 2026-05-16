# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBaseVectorIndexDetails(object):
    """
    Index configuration details
    """

    #: A constant which can be used with the type property of a KnowledgeBaseVectorIndexDetails.
    #: This constant has a value of "HNSW"
    TYPE_HNSW = "HNSW"

    #: A constant which can be used with the type property of a KnowledgeBaseVectorIndexDetails.
    #: This constant has a value of "IVF"
    TYPE_IVF = "IVF"

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBaseVectorIndexDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this KnowledgeBaseVectorIndexDetails.
            Allowed values for this property are: "HNSW", "IVF"
        :type type: str

        :param hnsw_details:
            The value to assign to the hnsw_details property of this KnowledgeBaseVectorIndexDetails.
        :type hnsw_details: oci.aidataplatform_dp.models.KbVHnswIndexDetails

        :param ivf_details:
            The value to assign to the ivf_details property of this KnowledgeBaseVectorIndexDetails.
        :type ivf_details: oci.aidataplatform_dp.models.KbVIvfIndexDetails

        """
        self.swagger_types = {
            'type': 'str',
            'hnsw_details': 'KbVHnswIndexDetails',
            'ivf_details': 'KbVIvfIndexDetails'
        }

        self.attribute_map = {
            'type': 'type',
            'hnsw_details': 'hnswDetails',
            'ivf_details': 'ivfDetails'
        }

        self._type = None
        self._hnsw_details = None
        self._ivf_details = None

    @property
    def type(self):
        """
        Gets the type of this KnowledgeBaseVectorIndexDetails.
        Type of vector index (HNSW or IVF)

        Allowed values for this property are: "HNSW", "IVF"


        :return: The type of this KnowledgeBaseVectorIndexDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this KnowledgeBaseVectorIndexDetails.
        Type of vector index (HNSW or IVF)


        :param type: The type of this KnowledgeBaseVectorIndexDetails.
        :type: str
        """
        allowed_values = ["HNSW", "IVF"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def hnsw_details(self):
        """
        Gets the hnsw_details of this KnowledgeBaseVectorIndexDetails.

        :return: The hnsw_details of this KnowledgeBaseVectorIndexDetails.
        :rtype: oci.aidataplatform_dp.models.KbVHnswIndexDetails
        """
        return self._hnsw_details

    @hnsw_details.setter
    def hnsw_details(self, hnsw_details):
        """
        Sets the hnsw_details of this KnowledgeBaseVectorIndexDetails.

        :param hnsw_details: The hnsw_details of this KnowledgeBaseVectorIndexDetails.
        :type: oci.aidataplatform_dp.models.KbVHnswIndexDetails
        """
        self._hnsw_details = hnsw_details

    @property
    def ivf_details(self):
        """
        Gets the ivf_details of this KnowledgeBaseVectorIndexDetails.

        :return: The ivf_details of this KnowledgeBaseVectorIndexDetails.
        :rtype: oci.aidataplatform_dp.models.KbVIvfIndexDetails
        """
        return self._ivf_details

    @ivf_details.setter
    def ivf_details(self, ivf_details):
        """
        Sets the ivf_details of this KnowledgeBaseVectorIndexDetails.

        :param ivf_details: The ivf_details of this KnowledgeBaseVectorIndexDetails.
        :type: oci.aidataplatform_dp.models.KbVIvfIndexDetails
        """
        self._ivf_details = ivf_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
