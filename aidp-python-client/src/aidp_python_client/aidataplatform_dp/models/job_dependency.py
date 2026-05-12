# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .dependency import Dependency
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class JobDependency(Dependency):
    """
    Job dependency. Represents a job with its dependencies. Can be used for both root jobs and nested jobs.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new JobDependency object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.JobDependency.type` attribute
        of this class is ``JOB`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this JobDependency.
            Allowed values for this property are: "FILE", "COMPUTE", "JOB"
        :type type: str

        :param key:
            The value to assign to the key property of this JobDependency.
        :type key: str

        :param dependencies:
            The value to assign to the dependencies property of this JobDependency.
        :type dependencies: list[oci.aidataplatform_dp.models.Dependency]

        """
        self.swagger_types = {
            'type': 'str',
            'key': 'str',
            'dependencies': 'list[Dependency]'
        }

        self.attribute_map = {
            'type': 'type',
            'key': 'key',
            'dependencies': 'dependencies'
        }

        self._type = None
        self._key = None
        self._dependencies = None
        self._type = 'JOB'

    @property
    def key(self):
        """
        **[Required]** Gets the key of this JobDependency.
        Unique identifier for the job.


        :return: The key of this JobDependency.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this JobDependency.
        Unique identifier for the job.


        :param key: The key of this JobDependency.
        :type: str
        """
        self._key = key

    @property
    def dependencies(self):
        """
        **[Required]** Gets the dependencies of this JobDependency.
        List of dependencies for this job.


        :return: The dependencies of this JobDependency.
        :rtype: list[oci.aidataplatform_dp.models.Dependency]
        """
        return self._dependencies

    @dependencies.setter
    def dependencies(self, dependencies):
        """
        Sets the dependencies of this JobDependency.
        List of dependencies for this job.


        :param dependencies: The dependencies of this JobDependency.
        :type: list[oci.aidataplatform_dp.models.Dependency]
        """
        self._dependencies = dependencies

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
