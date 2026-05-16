# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeleteModelVersionTagDetails(object):
    """
    Details of the ModelVersion tag.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeleteModelVersionTagDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this DeleteModelVersionTagDetails.
        :type name: str

        :param version:
            The value to assign to the version property of this DeleteModelVersionTagDetails.
        :type version: str

        :param key:
            The value to assign to the key property of this DeleteModelVersionTagDetails.
        :type key: str

        """
        self.swagger_types = {
            'name': 'str',
            'version': 'str',
            'key': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'version': 'version',
            'key': 'key'
        }

        self._name = None
        self._version = None
        self._key = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this DeleteModelVersionTagDetails.
        Name of the registered model.


        :return: The name of this DeleteModelVersionTagDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this DeleteModelVersionTagDetails.
        Name of the registered model.


        :param name: The name of this DeleteModelVersionTagDetails.
        :type: str
        """
        self._name = name

    @property
    def version(self):
        """
        **[Required]** Gets the version of this DeleteModelVersionTagDetails.
        Model\u2019s version number.


        :return: The version of this DeleteModelVersionTagDetails.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this DeleteModelVersionTagDetails.
        Model\u2019s version number.


        :param version: The version of this DeleteModelVersionTagDetails.
        :type: str
        """
        self._version = version

    @property
    def key(self):
        """
        **[Required]** Gets the key of this DeleteModelVersionTagDetails.
        Tag key.


        :return: The key of this DeleteModelVersionTagDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this DeleteModelVersionTagDetails.
        Tag key.


        :param key: The key of this DeleteModelVersionTagDetails.
        :type: str
        """
        self._key = key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
