# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Dataset(object):
    """
    Dataset. Represents a reference to data used for training, testing, or evaluation during the model development process.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new Dataset object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this Dataset.
        :type name: str

        :param digest:
            The value to assign to the digest property of this Dataset.
        :type digest: str

        :param source_type:
            The value to assign to the source_type property of this Dataset.
        :type source_type: str

        :param source:
            The value to assign to the source property of this Dataset.
        :type source: str

        :param schema:
            The value to assign to the schema property of this Dataset.
        :type schema: str

        :param profile:
            The value to assign to the profile property of this Dataset.
        :type profile: str

        """
        self.swagger_types = {
            'name': 'str',
            'digest': 'str',
            'source_type': 'str',
            'source': 'str',
            'schema': 'str',
            'profile': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'digest': 'digest',
            'source_type': 'source_type',
            'source': 'source',
            'schema': 'schema',
            'profile': 'profile'
        }

        self._name = None
        self._digest = None
        self._source_type = None
        self._source = None
        self._schema = None
        self._profile = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this Dataset.
        Name of the dataset


        :return: The name of this Dataset.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Dataset.
        Name of the dataset


        :param name: The name of this Dataset.
        :type: str
        """
        self._name = name

    @property
    def digest(self):
        """
        **[Required]** Gets the digest of this Dataset.
        Digest (hash) of the dataset


        :return: The digest of this Dataset.
        :rtype: str
        """
        return self._digest

    @digest.setter
    def digest(self, digest):
        """
        Sets the digest of this Dataset.
        Digest (hash) of the dataset


        :param digest: The digest of this Dataset.
        :type: str
        """
        self._digest = digest

    @property
    def source_type(self):
        """
        **[Required]** Gets the source_type of this Dataset.
        Type of the dataset source


        :return: The source_type of this Dataset.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this Dataset.
        Type of the dataset source


        :param source_type: The source_type of this Dataset.
        :type: str
        """
        self._source_type = source_type

    @property
    def source(self):
        """
        **[Required]** Gets the source of this Dataset.
        URI or path to the dataset source


        :return: The source of this Dataset.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this Dataset.
        URI or path to the dataset source


        :param source: The source of this Dataset.
        :type: str
        """
        self._source = source

    @property
    def schema(self):
        """
        Gets the schema of this Dataset.
        Schema of the dataset


        :return: The schema of this Dataset.
        :rtype: str
        """
        return self._schema

    @schema.setter
    def schema(self, schema):
        """
        Sets the schema of this Dataset.
        Schema of the dataset


        :param schema: The schema of this Dataset.
        :type: str
        """
        self._schema = schema

    @property
    def profile(self):
        """
        Gets the profile of this Dataset.
        Profile of the dataset


        :return: The profile of this Dataset.
        :rtype: str
        """
        return self._profile

    @profile.setter
    def profile(self, profile):
        """
        Sets the profile of this Dataset.
        Profile of the dataset


        :param profile: The profile of this Dataset.
        :type: str
        """
        self._profile = profile

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
