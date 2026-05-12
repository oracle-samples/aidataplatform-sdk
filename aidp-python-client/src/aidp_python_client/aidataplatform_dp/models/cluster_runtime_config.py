# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterRuntimeConfig(object):
    """
    Cluster runtime configurations.
    """

    #: A constant which can be used with the type property of a ClusterRuntimeConfig.
    #: This constant has a value of "SPARK"
    TYPE_SPARK = "SPARK"

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterRuntimeConfig object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.SparkRuntimeConfig`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ClusterRuntimeConfig.
            Allowed values for this property are: "SPARK", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        :param init_scripts:
            The value to assign to the init_scripts property of this ClusterRuntimeConfig.
        :type init_scripts: list[oci.aidataplatform_dp.models.InitScriptPath]

        """
        self.swagger_types = {
            'type': 'str',
            'init_scripts': 'list[InitScriptPath]'
        }

        self.attribute_map = {
            'type': 'type',
            'init_scripts': 'initScripts'
        }

        self._type = None
        self._init_scripts = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'SPARK':
            return 'SparkRuntimeConfig'
        else:
            return 'ClusterRuntimeConfig'

    @property
    def type(self):
        """
        Gets the type of this ClusterRuntimeConfig.
        Runtime type.

        Allowed values for this property are: "SPARK", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this ClusterRuntimeConfig.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ClusterRuntimeConfig.
        Runtime type.


        :param type: The type of this ClusterRuntimeConfig.
        :type: str
        """
        allowed_values = ["SPARK"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    @property
    def init_scripts(self):
        """
        Gets the init_scripts of this ClusterRuntimeConfig.
        Init script paths that are run in the order of definition.


        :return: The init_scripts of this ClusterRuntimeConfig.
        :rtype: list[oci.aidataplatform_dp.models.InitScriptPath]
        """
        return self._init_scripts

    @init_scripts.setter
    def init_scripts(self, init_scripts):
        """
        Sets the init_scripts of this ClusterRuntimeConfig.
        Init script paths that are run in the order of definition.


        :param init_scripts: The init_scripts of this ClusterRuntimeConfig.
        :type: list[oci.aidataplatform_dp.models.InitScriptPath]
        """
        self._init_scripts = init_scripts

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
