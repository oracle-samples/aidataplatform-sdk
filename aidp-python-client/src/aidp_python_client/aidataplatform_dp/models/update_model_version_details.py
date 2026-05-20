# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateModelVersionDetails(object):
    """
    Details of the model version.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateModelVersionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this UpdateModelVersionDetails.
        :type name: str

        :param version:
            The value to assign to the version property of this UpdateModelVersionDetails.
        :type version: str

        :param description:
            The value to assign to the description property of this UpdateModelVersionDetails.
        :type description: str

        """
        self.swagger_types = {
            'name': 'str',
            'version': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'version': 'version',
            'description': 'description'
        }

        self._name = None
        self._version = None
        self._description = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this UpdateModelVersionDetails.
        Name of the registered model.


        :return: The name of this UpdateModelVersionDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this UpdateModelVersionDetails.
        Name of the registered model.


        :param name: The name of this UpdateModelVersionDetails.
        :type: str
        """
        self._name = name

    @property
    def version(self):
        """
        **[Required]** Gets the version of this UpdateModelVersionDetails.
        Model version number.


        :return: The version of this UpdateModelVersionDetails.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this UpdateModelVersionDetails.
        Model version number.


        :param version: The version of this UpdateModelVersionDetails.
        :type: str
        """
        self._version = version

    @property
    def description(self):
        """
        Gets the description of this UpdateModelVersionDetails.
        New description for the model version.


        :return: The description of this UpdateModelVersionDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateModelVersionDetails.
        New description for the model version.


        :param description: The description of this UpdateModelVersionDetails.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
