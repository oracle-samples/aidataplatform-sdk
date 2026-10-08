# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BaseLlmConfig(object):
    """
    Base Large Language Model configuration.
    """

    #: A constant which can be used with the type property of a BaseLlmConfig.
    #: This constant has a value of "OCI_GEN_AI"
    TYPE_OCI_GEN_AI = "OCI_GEN_AI"

    #: A constant which can be used with the type property of a BaseLlmConfig.
    #: This constant has a value of "THIRD_PARTY"
    TYPE_THIRD_PARTY = "THIRD_PARTY"

    def __init__(self, **kwargs):
        """
        Initializes a new BaseLlmConfig object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.LlmConfig`
        * :class:`~oci.aidataplatform_dp.models.ThirdPartyLlmConfig`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this BaseLlmConfig.
            Allowed values for this property are: "OCI_GEN_AI", "THIRD_PARTY", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param model_id:
            The value to assign to the model_id property of this BaseLlmConfig.
        :type model_id: str

        :param compartment_id:
            The value to assign to the compartment_id property of this BaseLlmConfig.
        :type compartment_id: str

        :param endpoint_url:
            The value to assign to the endpoint_url property of this BaseLlmConfig.
        :type endpoint_url: str

        """
        self.swagger_types = {
            'type': 'str',
            'model_id': 'str',
            'compartment_id': 'str',
            'endpoint_url': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'model_id': 'modelId',
            'compartment_id': 'compartmentId',
            'endpoint_url': 'endpointUrl'
        }

        self._type = None
        self._model_id = None
        self._compartment_id = None
        self._endpoint_url = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'OCI_GEN_AI':
            return 'LlmConfig'

        if type == 'THIRD_PARTY':
            return 'ThirdPartyLlmConfig'
        else:
            return 'BaseLlmConfig'

    @property
    def type(self):
        """
        Gets the type of this BaseLlmConfig.
        The type of the Large Language Model configuration.

        Allowed values for this property are: "OCI_GEN_AI", "THIRD_PARTY", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this BaseLlmConfig.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this BaseLlmConfig.
        The type of the Large Language Model configuration.


        :param type: The type of this BaseLlmConfig.
        :type: str
        """
        allowed_values = ["OCI_GEN_AI", "THIRD_PARTY"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def model_id(self):
        """
        Gets the model_id of this BaseLlmConfig.
        The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool.


        :return: The model_id of this BaseLlmConfig.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this BaseLlmConfig.
        The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool.


        :param model_id: The model_id of this BaseLlmConfig.
        :type: str
        """
        self._model_id = model_id

    @property
    def compartment_id(self):
        """
        Gets the compartment_id of this BaseLlmConfig.
        The compartment id of the Large Language Model (LLM) to use in the Agent or Tool


        :return: The compartment_id of this BaseLlmConfig.
        :rtype: str
        """
        return self._compartment_id

    @compartment_id.setter
    def compartment_id(self, compartment_id):
        """
        Sets the compartment_id of this BaseLlmConfig.
        The compartment id of the Large Language Model (LLM) to use in the Agent or Tool


        :param compartment_id: The compartment_id of this BaseLlmConfig.
        :type: str
        """
        self._compartment_id = compartment_id

    @property
    def endpoint_url(self):
        """
        Gets the endpoint_url of this BaseLlmConfig.
        The endpoint URL of the Large Language Model (LLM) to use in the Agent or Tool


        :return: The endpoint_url of this BaseLlmConfig.
        :rtype: str
        """
        return self._endpoint_url

    @endpoint_url.setter
    def endpoint_url(self, endpoint_url):
        """
        Sets the endpoint_url of this BaseLlmConfig.
        The endpoint URL of the Large Language Model (LLM) to use in the Agent or Tool


        :param endpoint_url: The endpoint_url of this BaseLlmConfig.
        :type: str
        """
        self._endpoint_url = endpoint_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
