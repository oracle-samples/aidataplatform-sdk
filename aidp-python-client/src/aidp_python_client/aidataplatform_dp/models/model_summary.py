# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelSummary(object):
    """
    The summary of the Model.
    """

    #: A constant which can be used with the model_type property of a ModelSummary.
    #: This constant has a value of "GEN_AI"
    MODEL_TYPE_GEN_AI = "GEN_AI"

    def __init__(self, **kwargs):
        """
        Initializes a new ModelSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this ModelSummary.
        :type id: str

        :param model_name:
            The value to assign to the model_name property of this ModelSummary.
        :type model_name: str

        :param display_name:
            The value to assign to the display_name property of this ModelSummary.
        :type display_name: str

        :param model_version:
            The value to assign to the model_version property of this ModelSummary.
        :type model_version: str

        :param vendor:
            The value to assign to the vendor property of this ModelSummary.
        :type vendor: str

        :param model_type:
            The value to assign to the model_type property of this ModelSummary.
            Allowed values for this property are: "GEN_AI"
        :type model_type: str

        """
        self.swagger_types = {
            'id': 'str',
            'model_name': 'str',
            'display_name': 'str',
            'model_version': 'str',
            'vendor': 'str',
            'model_type': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'model_name': 'modelName',
            'display_name': 'displayName',
            'model_version': 'modelVersion',
            'vendor': 'vendor',
            'model_type': 'modelType'
        }

        self._id = None
        self._model_name = None
        self._display_name = None
        self._model_version = None
        self._vendor = None
        self._model_type = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this ModelSummary.
        A unique Id for the Model summary, that is immutable on creation.


        :return: The id of this ModelSummary.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this ModelSummary.
        A unique Id for the Model summary, that is immutable on creation.


        :param id: The id of this ModelSummary.
        :type: str
        """
        self._id = id

    @property
    def model_name(self):
        """
        **[Required]** Gets the model_name of this ModelSummary.
        A unique key for the Model summary, that is immutable on creation.


        :return: The model_name of this ModelSummary.
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """
        Sets the model_name of this ModelSummary.
        A unique key for the Model summary, that is immutable on creation.


        :param model_name: The model_name of this ModelSummary.
        :type: str
        """
        self._model_name = model_name

    @property
    def display_name(self):
        """
        Gets the display_name of this ModelSummary.
        The Model summary name, it can be changed.


        :return: The display_name of this ModelSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ModelSummary.
        The Model summary name, it can be changed.


        :param display_name: The display_name of this ModelSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def model_version(self):
        """
        **[Required]** Gets the model_version of this ModelSummary.
        version that is available for that Model.


        :return: The model_version of this ModelSummary.
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """
        Sets the model_version of this ModelSummary.
        version that is available for that Model.


        :param model_version: The model_version of this ModelSummary.
        :type: str
        """
        self._model_version = model_version

    @property
    def vendor(self):
        """
        Gets the vendor of this ModelSummary.
        vendor name for that Model.


        :return: The vendor of this ModelSummary.
        :rtype: str
        """
        return self._vendor

    @vendor.setter
    def vendor(self, vendor):
        """
        Sets the vendor of this ModelSummary.
        vendor name for that Model.


        :param vendor: The vendor of this ModelSummary.
        :type: str
        """
        self._vendor = vendor

    @property
    def model_type(self):
        """
        **[Required]** Gets the model_type of this ModelSummary.
        Possible modelTypes of Models object

        Allowed values for this property are: "GEN_AI"


        :return: The model_type of this ModelSummary.
        :rtype: str
        """
        return self._model_type

    @model_type.setter
    def model_type(self, model_type):
        """
        Sets the model_type of this ModelSummary.
        Possible modelTypes of Models object


        :param model_type: The model_type of this ModelSummary.
        :type: str
        """
        allowed_values = ["GEN_AI"]
        if not value_allowed_none_or_none_sentinel(model_type, allowed_values):
            raise ValueError(
                "Invalid value for `model_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._model_type = model_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
