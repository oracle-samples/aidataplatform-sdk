# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RegisteredModelAlias(object):
    """
    Alias of the RegisteredModel
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RegisteredModelAlias object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param alias:
            The value to assign to the alias property of this RegisteredModelAlias.
        :type alias: str

        :param version:
            The value to assign to the version property of this RegisteredModelAlias.
        :type version: str

        """
        self.swagger_types = {
            'alias': 'str',
            'version': 'str'
        }

        self.attribute_map = {
            'alias': 'alias',
            'version': 'version'
        }

        self._alias = None
        self._version = None

    @property
    def alias(self):
        """
        Gets the alias of this RegisteredModelAlias.
        The name of the alias.


        :return: The alias of this RegisteredModelAlias.
        :rtype: str
        """
        return self._alias

    @alias.setter
    def alias(self, alias):
        """
        Sets the alias of this RegisteredModelAlias.
        The name of the alias.


        :param alias: The alias of this RegisteredModelAlias.
        :type: str
        """
        self._alias = alias

    @property
    def version(self):
        """
        Gets the version of this RegisteredModelAlias.
        The model version number that the alias points to.


        :return: The version of this RegisteredModelAlias.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this RegisteredModelAlias.
        The model version number that the alias points to.


        :param version: The version of this RegisteredModelAlias.
        :type: str
        """
        self._version = version

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
